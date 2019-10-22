package com.xiaofengczy.design.structural.strategy;

/**
 * @author caozhongyu
 * @FileName: MigrationContent
 * @Description:
 * @create 19-10-18
 */
public class MigrationContent {
  private MigrationStrategy migrationStrategy;

  public MigrationContent(MigrationStrategy migrationStrategy){
    this.migrationStrategy = migrationStrategy;
  }

  public void doMigration(){
    this.migrationStrategy.migrationForm();
    this.migrationStrategy.saveStandard();
    this.migrationStrategy.saveCheckList();
    this.migrationStrategy.saveEquipmentAndFormRelation();
    this.migrationStrategy.migrationHistory();
  }

}
