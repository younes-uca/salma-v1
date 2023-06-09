package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Notification;
import ma.sir.hr.bean.history.NotificationHistory;
import ma.sir.hr.dao.criteria.core.NotificationCriteria;
import ma.sir.hr.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.hr.service.facade.admin.NotificationAdminService;
import ma.sir.hr.ws.converter.NotificationConverter;
import ma.sir.hr.ws.dto.NotificationDto;
import ma.sir.hr.zynerator.controller.AbstractController;
import ma.sir.hr.zynerator.dto.AuditEntityDto;
import ma.sir.hr.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.hr.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.hr.zynerator.dto.FileTempDto;

@Api("Manages notification services")
@RestController
@RequestMapping("/api/admin/notification/")
public class NotificationRestAdmin  extends AbstractController<Notification, NotificationDto, NotificationHistory, NotificationCriteria, NotificationHistoryCriteria, NotificationAdminService, NotificationConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all notifications")
    @GetMapping("")
    public ResponseEntity<List<NotificationDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a notification by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NotificationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  notification")
    @PostMapping("")
    public ResponseEntity<NotificationDto> save(@RequestBody NotificationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  notification")
    @PutMapping("")
    public ResponseEntity<NotificationDto> update(@RequestBody NotificationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of notification")
    @PostMapping("multiple")
    public ResponseEntity<List<NotificationDto>> delete(@RequestBody List<NotificationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified notification")
    @DeleteMapping("")
    public ResponseEntity<NotificationDto> delete(@RequestBody NotificationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified notification")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple notifications by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds notifications by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NotificationDto>> findByCriteria(@RequestBody NotificationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated notifications by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NotificationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports notifications by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NotificationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets notification data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NotificationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets notification history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets notification paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NotificationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports notification history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NotificationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets notification history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NotificationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NotificationRestAdmin (NotificationAdminService service, NotificationConverter converter) {
        super(service, converter);
    }


}