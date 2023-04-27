package  ma.sir.hr.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.hr.bean.core.Employe;
import ma.sir.hr.bean.history.EmployeHistory;
import ma.sir.hr.dao.criteria.core.EmployeCriteria;
import ma.sir.hr.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.hr.service.facade.admin.EmployeAdminService;
import ma.sir.hr.ws.converter.EmployeConverter;
import ma.sir.hr.ws.dto.EmployeDto;
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

@Api("Manages employe services")
@RestController
@RequestMapping("/api/admin/employe/")
public class EmployeRestAdmin  extends AbstractController<Employe, EmployeDto, EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeAdminService, EmployeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all employes")
    @GetMapping("")
    public ResponseEntity<List<EmployeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all employes")
    @GetMapping("optimized")
    public ResponseEntity<List<EmployeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a employe by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EmployeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  employe")
    @PostMapping("")
    public ResponseEntity<EmployeDto> save(@RequestBody EmployeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  employe")
    @PutMapping("")
    public ResponseEntity<EmployeDto> update(@RequestBody EmployeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of employe")
    @PostMapping("multiple")
    public ResponseEntity<List<EmployeDto>> delete(@RequestBody List<EmployeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified employe")
    @DeleteMapping("")
    public ResponseEntity<EmployeDto> delete(@RequestBody EmployeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified employe")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple employes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by sexe id")
    @GetMapping("sexe/id/{id}")
    public List<Employe> findBySexeId(@PathVariable Long id){
        return service.findBySexeId(id);
    }
    @ApiOperation("delete by sexe id")
    @DeleteMapping("sexe/id/{id}")
    public int deleteBySexeId(@PathVariable Long id){
        return service.deleteBySexeId(id);
    }
    @ApiOperation("find by parcoursUniversitaire id")
    @GetMapping("parcoursUniversitaire/id/{id}")
    public List<Employe> findByParcoursUniversitaireId(@PathVariable Long id){
        return service.findByParcoursUniversitaireId(id);
    }
    @ApiOperation("delete by parcoursUniversitaire id")
    @DeleteMapping("parcoursUniversitaire/id/{id}")
    public int deleteByParcoursUniversitaireId(@PathVariable Long id){
        return service.deleteByParcoursUniversitaireId(id);
    }
    @ApiOperation("find by departement id")
    @GetMapping("departement/id/{id}")
    public List<Employe> findByDepartementId(@PathVariable Long id){
        return service.findByDepartementId(id);
    }
    @ApiOperation("delete by departement id")
    @DeleteMapping("departement/id/{id}")
    public int deleteByDepartementId(@PathVariable Long id){
        return service.deleteByDepartementId(id);
    }
    @ApiOperation("find by poste id")
    @GetMapping("poste/id/{id}")
    public List<Employe> findByPosteId(@PathVariable Long id){
        return service.findByPosteId(id);
    }
    @ApiOperation("delete by poste id")
    @DeleteMapping("poste/id/{id}")
    public int deleteByPosteId(@PathVariable Long id){
        return service.deleteByPosteId(id);
    }
    @ApiOperation("find by notation id")
    @GetMapping("notation/id/{id}")
    public List<Employe> findByNotationId(@PathVariable Long id){
        return service.findByNotationId(id);
    }
    @ApiOperation("delete by notation id")
    @DeleteMapping("notation/id/{id}")
    public int deleteByNotationId(@PathVariable Long id){
        return service.deleteByNotationId(id);
    }
    @ApiOperation("find by conges id")
    @GetMapping("conges/id/{id}")
    public List<Employe> findByCongesId(@PathVariable Long id){
        return service.findByCongesId(id);
    }
    @ApiOperation("delete by conges id")
    @DeleteMapping("conges/id/{id}")
    public int deleteByCongesId(@PathVariable Long id){
        return service.deleteByCongesId(id);
    }
    @ApiOperation("find by echelle id")
    @GetMapping("echelle/id/{id}")
    public List<Employe> findByEchelleId(@PathVariable Long id){
        return service.findByEchelleId(id);
    }
    @ApiOperation("delete by echelle id")
    @DeleteMapping("echelle/id/{id}")
    public int deleteByEchelleId(@PathVariable Long id){
        return service.deleteByEchelleId(id);
    }
    @ApiOperation("find by echelon id")
    @GetMapping("echelon/id/{id}")
    public List<Employe> findByEchelonId(@PathVariable Long id){
        return service.findByEchelonId(id);
    }
    @ApiOperation("delete by echelon id")
    @DeleteMapping("echelon/id/{id}")
    public int deleteByEchelonId(@PathVariable Long id){
        return service.deleteByEchelonId(id);
    }
    @ApiOperation("find by grade id")
    @GetMapping("grade/id/{id}")
    public List<Employe> findByGradeId(@PathVariable Long id){
        return service.findByGradeId(id);
    }
    @ApiOperation("delete by grade id")
    @DeleteMapping("grade/id/{id}")
    public int deleteByGradeId(@PathVariable Long id){
        return service.deleteByGradeId(id);
    }
    @ApiOperation("Finds employes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EmployeDto>> findByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated employes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports employes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets employe data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets employe history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets employe paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EmployeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports employe history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EmployeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets employe history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EmployeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EmployeRestAdmin (EmployeAdminService service, EmployeConverter converter) {
        super(service, converter);
    }


}