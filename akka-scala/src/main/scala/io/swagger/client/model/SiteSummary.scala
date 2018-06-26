/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class SiteSummary (
  /* Site identifier. */
  siteId: String,
  /* Site security level. */
  securityLevel: SiteSummaryEnums.SecurityLevel,
  /* Privacy current status. */
  privacyActive: Boolean,
  /* Read only status. */
  readOnly: Boolean,
  /* HCS site identifier. */
  hcsSiteId: Option[String],
  /* Site origin. */
  origin: Option[String],
  /* Axa IT phone number. */
  axaItPhoneNumber: Option[String],
  /* Axa IT phone number formatted. */
  axaItPhoneNumberDisplayed: Option[String],
  /* Features enabled. */
  features: Option[Seq[String]],
  /* Site label. */
  label: Option[String],
  /* Timezone of the site location. */
  timezone: Option[String],
  /* Name of the site location. */
  name: Option[String],
  /* Address of the site location. */
  address1: Option[String],
  /* Address complement of the site location. */
  address2: Option[String],
  /* Post code of the site location. */
  zipCode: Option[String],
  /* City of the site location. */
  city: Option[String],
  /* Region/State of the site location. */
  region: Option[String],
  /* Country code of the site location (uppercase two-letter ISO-3166-1 alpha-2 code). */
  country: Option[String],
  /* Cross street details. */
  crosstreet: Option[String],
  /* Address complement. */
  complement: Option[String],
  /* Address latitude. */
  latitude: Option[String],
  /* Address longitude. */
  longitude: Option[String],
  /* Police phone number of the site area. */
  policePhoneNumber: Option[String],
  /* Enable KIDS feature. */
  kidsEnabled: Option[Boolean],
  /* Display presence for Kids. */
  displayKidPresence: Option[Boolean],
  /* Display presence for guests. */
  displayGuestPresence: Option[Boolean],
  /* Enable automatic shutter (for cameras). */
  shutterAutomaticEnabled: Option[Boolean],
  /* Enable user presence display. */
  presenceEnabled: Option[Boolean],
  /* Enable smoke alarm detection. */
  smokeAlarmListeningEnabled: Option[Boolean],
  /* Enable Myfox Around. */
  mfaEnabled: Option[Boolean],
  /* Myfox Around  Feature. */
  mfaAvailable: Option[Boolean],
  /* Installer Id. */
  installerId: Option[String]
) extends ApiModel

object SiteSummaryEnums {

  type SecurityLevel = SecurityLevel.Value
  object SecurityLevel extends Enumeration {
    val Disarmed = Value("disarmed")
    val Partial = Value("partial")
    val Armed = Value("armed")
  }

}

