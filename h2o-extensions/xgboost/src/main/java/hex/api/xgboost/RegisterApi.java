package hex.api.xgboost;

import hex.tree.xgboost.XGBoost;
import water.api.SchemaServer;

public class RegisterApi extends water.api.AbstractRegister {

  @Override
  public void register(String relativeResourcePath) {
    XGBoost xgBoostMB = new XGBoost(true);
    // Register XGBoost model builder REST API
    registerModelBuilder(xgBoostMB, SchemaServer.getExperimentalVersion());
  }
}