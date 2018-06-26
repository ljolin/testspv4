/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class DeviceSummary (
  /* The device unique identifier. */
  deviceId: String,
  /* The device box identifier. */
  boxId: Option[String],
  /* The device site identifier. */
  siteId: String,
  /* The device firmware version. */
  version: Option[String],
  /* The device MAC address. */
  mac: Option[String],
  /* The device definition. */
  deviceDefinition: DeviceDefinition,
  /* Device is into a subscription (uninstall will be forbidden). */
  intoSubscription: Option[Boolean],
  /* Camera has push to talk available. */
  pushToTalkAvailable: Option[Boolean],
  /* Provider ID. */
  providerId: Option[String],
  updateAvailable: Option[Boolean],
  /* Is it master device. */
  master: Option[Boolean],
  /* Somfy One Type. */
  somfyOneType: Option[DeviceSummaryEnums.SomfyOneType],
  /* Video Backend. */
  videoBackend: Option[String],
  /* The device label. */
  label: Option[String]
) extends ApiModel

object DeviceSummaryEnums {

  type SomfyOneType = SomfyOneType.Value
  object SomfyOneType extends Enumeration {
    val SomfyOne = Value("somfy_one")
    val SomfyOnePlus = Value("somfy_one_plus")
  }

}

