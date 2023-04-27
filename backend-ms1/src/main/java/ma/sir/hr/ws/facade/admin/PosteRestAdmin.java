package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Poste;
import ma.sir.hr.bean.history.PosteHistory;
import ma.sir.hr.dao.criteria.core.PosteCriteria;
import ma.sir.hr.dao.criteria.history.PosteHistoryCriteria;
import ma.sir.hr.service.facade.admin.PosteAdminService;
import ma.sir.hr.ws.converter.PosteConverter;
import ma.sir.hr.ws.dto.PosteDto;
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

@Api("Manages poste services")
@RestController
@RequestMapping("/api/admin/poste/")
public class PosteRestAdmin  extends AbstractController<Poste, PosteDto, PosteHistory, PosteCriteria, PosteHistoryCriteria, PosteAdminService, PosteConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all postes")
    @GetMapping("")
    public ResponseEntity<List<PosteDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a poste by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PosteDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  poste")
    @PostMapping("")
    public ResponseEntity<PosteDto> save(@RequestBody PosteDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  poste")
    @PutMapping("")
    public ResponseEntity<PosteDto> update(@RequestBody PosteDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of poste")
    @PostMapping("multiple")
    public ResponseEntity<List<PosteDto>> delete(@RequestBody List<PosteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified poste")
    @DeleteMapping("")
    public ResponseEntity<PosteDto> delete(@RequestBody PosteDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified poste")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple postes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by departement id")
    @GetMapping("departement/id/{id}")
    public List<Poste> findByDepartementId(@PathVariable Long id){
        return service.findByDepartementId(id);
    }
    @ApiOperation("delete by departement id")
    @DeleteMapping("departement/id/{id}")
    public int deleteByDepartementId(@PathVariable Long id){
        return service.deleteByDepartementId(id);
    }
    @ApiOperation("Finds postes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PosteDto>> findByCriteria(@RequestBody PosteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated postes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PosteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports postes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PosteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets poste data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PosteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets poste history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets poste paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PosteHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports poste history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PosteHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets poste history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PosteHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PosteRestAdmin (PosteAdminService service, PosteConverter converter) {
        super(service, converter);
    }


}