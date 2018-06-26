/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class UserInfo (
  alexaSelectedSiteId: Option[String],
  /* User identifier. */
  userId: Option[String],
  /* User creation date. */
  createdAt: Option[DateTime],
  /* Is user account activated? */
  activated: Option[Boolean],
  /* Type of user. */
  typeUser: Option[UserInfoEnums.TypeUser],
  /* Identifier of user photo. */
  photoId: Option[String],
  /* Name to display for this user. */
  displayName: Option[String],
  /* User origin. */
  origin: Option[String],
  /* User pro details. */
  proDetails: Option[String],
  /* User firstname. */
  firstname: Option[String],
  /* User lastname. */
  lastname: Option[String],
  /* User email. */
  username: Option[String],
  /* User gender. */
  gender: Option[UserInfoEnums.Gender],
  /* User locale. */
  locale: Option[String],
  /* User phone number. */
  phone: Option[String]
) extends ApiModel

object UserInfoEnums {

  type TypeUser = TypeUser.Value
  type Gender = Gender.Value
  object TypeUser extends Enumeration {
    val Account = Value("account")
    val Guest = Value("guest")
  }

  object Gender extends Enumeration {
    val `F` = Value("F")
    val `M` = Value("M")
  }

}
