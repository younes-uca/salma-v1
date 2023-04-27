import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {DatePipe} from '@angular/common';

import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import {RoleService} from 'src/app/zynerator/security/Role.service';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';

import {MessageService} from 'primeng/api';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';

import {EchelonDto} from 'src/app/controller/model/Echelon.model';
import {EchelonService} from 'src/app/controller/service/Echelon.service';
import {EchelleDto} from 'src/app/controller/model/Echelle.model';
import {EchelleService} from 'src/app/controller/service/Echelle.service';
import {ParcoursUniversitaireDto} from 'src/app/controller/model/ParcoursUniversitaire.model';
import {ParcoursUniversitaireService} from 'src/app/controller/service/ParcoursUniversitaire.service';
import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {SexeDto} from 'src/app/controller/model/Sexe.model';
import {SexeService} from 'src/app/controller/service/Sexe.service';
import {PosteDto} from 'src/app/controller/model/Poste.model';
import {PosteService} from 'src/app/controller/service/Poste.service';
import {CongesDto} from 'src/app/controller/model/Conges.model';
import {CongesService} from 'src/app/controller/service/Conges.service';
import {GradeDto} from 'src/app/controller/model/Grade.model';
import {GradeService} from 'src/app/controller/service/Grade.service';
import {NotationDto} from 'src/app/controller/model/Notation.model';
import {NotationService} from 'src/app/controller/service/Notation.service';
@Component({
  selector: 'app-employe-view-admin',
  templateUrl: './employe-view-admin.component.html'
})
export class EmployeViewAdminComponent extends AbstractViewController<EmployeDto, EmployeCriteria, EmployeService> implements OnInit {


    constructor(private datePipe: DatePipe, private employeService: EmployeService
                , private stringUtilService: StringUtilService, private roleService: RoleService,  private messageService: MessageService
                , private router: Router  
, private echelonService: EchelonService, private echelleService: EchelleService, private parcoursUniversitaireService: ParcoursUniversitaireService, private departementService: DepartementService, private sexeService: SexeService, private posteService: PosteService, private congesService: CongesService, private gradeService: GradeService, private notationService: NotationService
    ){
        super(datePipe, employeService, messageService, roleService, router, stringUtilService);
    }

    ngOnInit(): void {
        this.sexe = new SexeDto();
        this.sexeService.findAll().subscribe((data) => this.sexes = data);
        this.parcoursUniversitaire = new ParcoursUniversitaireDto();
        this.parcoursUniversitaireService.findAll().subscribe((data) => this.parcoursUniversitaires = data);
        this.departement = new DepartementDto();
        this.departementService.findAll().subscribe((data) => this.departements = data);
        this.poste = new PosteDto();
        this.posteService.findAll().subscribe((data) => this.postes = data);
        this.notation = new NotationDto();
        this.notationService.findAll().subscribe((data) => this.notations = data);
        this.conges = new CongesDto();
        this.congesService.findAll().subscribe((data) => this.congess = data);
        this.echelle = new EchelleDto();
        this.echelleService.findAll().subscribe((data) => this.echelles = data);
        this.echelon = new EchelonDto();
        this.echelonService.findAll().subscribe((data) => this.echelons = data);
        this.grade = new GradeDto();
        this.gradeService.findAll().subscribe((data) => this.grades = data);
    }


    get echelle(): EchelleDto {
       return this.echelleService.item;
    }
    set echelle(value: EchelleDto) {
        this.echelleService.item = value;
    }
    get echelles():Array<EchelleDto> {
       return this.echelleService.items;
    }
    set echelles(value: Array<EchelleDto>) {
        this.echelleService.items = value;
    }
    get echelon(): EchelonDto {
       return this.echelonService.item;
    }
    set echelon(value: EchelonDto) {
        this.echelonService.item = value;
    }
    get echelons():Array<EchelonDto> {
       return this.echelonService.items;
    }
    set echelons(value: Array<EchelonDto>) {
        this.echelonService.items = value;
    }
    get notation(): NotationDto {
       return this.notationService.item;
    }
    set notation(value: NotationDto) {
        this.notationService.item = value;
    }
    get notations():Array<NotationDto> {
       return this.notationService.items;
    }
    set notations(value: Array<NotationDto>) {
        this.notationService.items = value;
    }
    get conges(): CongesDto {
       return this.congesService.item;
    }
    set conges(value: CongesDto) {
        this.congesService.item = value;
    }
    get congess():Array<CongesDto> {
       return this.congesService.items;
    }
    set congess(value: Array<CongesDto>) {
        this.congesService.items = value;
    }
    get grade(): GradeDto {
       return this.gradeService.item;
    }
    set grade(value: GradeDto) {
        this.gradeService.item = value;
    }
    get grades():Array<GradeDto> {
       return this.gradeService.items;
    }
    set grades(value: Array<GradeDto>) {
        this.gradeService.items = value;
    }
    get departement(): DepartementDto {
       return this.departementService.item;
    }
    set departement(value: DepartementDto) {
        this.departementService.item = value;
    }
    get departements():Array<DepartementDto> {
       return this.departementService.items;
    }
    set departements(value: Array<DepartementDto>) {
        this.departementService.items = value;
    }
    get sexe(): SexeDto {
       return this.sexeService.item;
    }
    set sexe(value: SexeDto) {
        this.sexeService.item = value;
    }
    get sexes():Array<SexeDto> {
       return this.sexeService.items;
    }
    set sexes(value: Array<SexeDto>) {
        this.sexeService.items = value;
    }
    get poste(): PosteDto {
       return this.posteService.item;
    }
    set poste(value: PosteDto) {
        this.posteService.item = value;
    }
    get postes():Array<PosteDto> {
       return this.posteService.items;
    }
    set postes(value: Array<PosteDto>) {
        this.posteService.items = value;
    }
    get parcoursUniversitaire(): ParcoursUniversitaireDto {
       return this.parcoursUniversitaireService.item;
    }
    set parcoursUniversitaire(value: ParcoursUniversitaireDto) {
        this.parcoursUniversitaireService.item = value;
    }
    get parcoursUniversitaires():Array<ParcoursUniversitaireDto> {
       return this.parcoursUniversitaireService.items;
    }
    set parcoursUniversitaires(value: Array<ParcoursUniversitaireDto>) {
        this.parcoursUniversitaireService.items = value;
    }


}
