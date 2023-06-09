package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Local;
import ma.sir.hr.bean.history.LocalHistory;
import ma.sir.hr.dao.criteria.core.LocalCriteria;
import ma.sir.hr.dao.criteria.history.LocalHistoryCriteria;
import ma.sir.hr.service.facade.admin.LocalAdminService;
import ma.sir.hr.ws.converter.LocalConverter;
import ma.sir.hr.ws.dto.LocalDto;
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

@Api("Manages local services")
@RestController
@RequestMapping("/api/admin/local/")
public class LocalRestAdmin  extends AbstractController<Local, LocalDto, LocalHistory, LocalCriteria, LocalHistoryCriteria, LocalAdminService, LocalConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all locals")
    @GetMapping("")
    public ResponseEntity<List<LocalDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a local by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LocalDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  local")
    @PostMapping("")
    public ResponseEntity<LocalDto> save(@RequestBody LocalDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  local")
    @PutMapping("")
    public ResponseEntity<LocalDto> update(@RequestBody LocalDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of local")
    @PostMapping("multiple")
    public ResponseEntity<List<LocalDto>> delete(@RequestBody List<LocalDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified local")
    @DeleteMapping("")
    public ResponseEntity<LocalDto> delete(@RequestBody LocalDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified local")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple locals by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds locals by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LocalDto>> findByCriteria(@RequestBody LocalCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated locals by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LocalCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locals by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LocalCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets local data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LocalCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets local history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets local paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LocalHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports local history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LocalHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets local history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LocalHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LocalRestAdmin (LocalAdminService service, LocalConverter converter) {
        super(service, converter);
    }


}