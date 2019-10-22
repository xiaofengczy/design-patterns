package com.xiaofengczy.design.structural.strategy;

import java.util.List;

/**
 * @author caozhongyu
 * @FileName: MigrationBO
 * @Description:
 * @create 19-10-18
 */
public class MigrationBO {

  private boolean newVersion;

  private List<String> migrationData;

  public boolean isNewVersion() {
    return newVersion;
  }

  public void setNewVersion(boolean newVersion) {
    this.newVersion = newVersion;
  }

  public List<String> getMigrationData() {
    return migrationData;
  }

  public void setMigrationData(List<String> migrationData) {
    this.migrationData = migrationData;
  }
}
