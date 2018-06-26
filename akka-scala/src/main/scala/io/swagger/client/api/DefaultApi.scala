/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.DeviceSummary
import io.swagger.client.model.SiteDiagnosis
import io.swagger.client.model.SiteSummary
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object DefaultApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[DeviceSummary] (Successful operation)
   * 
   * @param siteId Site identitfier.
   */
  def siteSiteIdDeviceGet(siteId: String): ApiRequest[Seq[DeviceSummary]] =
    ApiRequest[Seq[DeviceSummary]](ApiMethods.GET, "https://polls.apiblueprint.org/v4/", "/site/{site_id}/device", "application/json")
      .withPathParam("site_id", siteId)
      .withSuccessResponse[Seq[DeviceSummary]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[SiteDiagnosis] (Successful operation)
   * 
   * @param siteId Site identitfier.
   */
  def siteSiteIdDiagnosticGet(siteId: String): ApiRequest[Seq[SiteDiagnosis]] =
    ApiRequest[Seq[SiteDiagnosis]](ApiMethods.GET, "https://polls.apiblueprint.org/v4/", "/site/{site_id}/diagnostic", "application/json")
      .withPathParam("site_id", siteId)
      .withSuccessResponse[Seq[SiteDiagnosis]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 :  (Successful operation)
   * 
   * @param userId User identitfier, current user if not provided
   */
  def userUserIdGet(userId: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://polls.apiblueprint.org/v4/", "/user/{user_id}", "application/json")
      .withPathParam("user_id", userId)
      .withSuccessResponse[Unit](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[SiteSummary] (Successful operation)
   * 
   * @param userId User identitfier.
   */
  def userUserIdSiteGet(userId: String): ApiRequest[Seq[SiteSummary]] =
    ApiRequest[Seq[SiteSummary]](ApiMethods.GET, "https://polls.apiblueprint.org/v4/", "/user/{user_id}/site", "application/json")
      .withPathParam("user_id", userId)
      .withSuccessResponse[Seq[SiteSummary]](200)
      

}

