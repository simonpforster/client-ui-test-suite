/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.conf.TestConfiguration

object ExamplePage extends BasePage {

  val url: String = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val title       = "Authority Wizard"

}
