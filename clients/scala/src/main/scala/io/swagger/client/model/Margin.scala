/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [Changelog](/app/apiChangelog)  ----  #### Getting Started   ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](https://www.bitmex.com/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ---  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model

import java.util.Date



case class Margin (
  account: Number,
currency: String,
riskLimit: Number,
prevState: String,
state: String,
action: String,
amount: Number,
pendingCredit: Number,
pendingDebit: Number,
confirmedDebit: Number,
prevRealisedPnl: Number,
prevUnrealisedPnl: Number,
grossComm: Number,
grossOpenCost: Number,
grossOpenPremium: Number,
grossExecCost: Number,
grossMarkValue: Number,
riskValue: Number,
taxableMargin: Number,
initMargin: Number,
maintMargin: Number,
sessionMargin: Number,
targetExcessMargin: Number,
varMargin: Number,
realisedPnl: Number,
unrealisedPnl: Number,
indicativeTax: Number,
unrealisedProfit: Number,
syntheticMargin: Number,
walletBalance: Number,
marginBalance: Number,
marginBalancePcnt: Double,
marginLeverage: Double,
marginUsedPcnt: Double,
excessMargin: Number,
excessMarginPcnt: Double,
availableMargin: Number,
withdrawableMargin: Number,
timestamp: Date,
grossLastValue: Number,
commission: Double)