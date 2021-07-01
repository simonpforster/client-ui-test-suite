/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.scalatest.matchers.should.Matchers

trait BasePage extends Matchers {
  val url: String
}
