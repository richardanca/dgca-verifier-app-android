/*
 *  ---license-start
 *  eu-digital-green-certificates / dgca-verifier-app-android
 *  ---
 *  Copyright (C) 2021 T-Systems International GmbH and all other contributors
 *  ---
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ---license-end
 *
 *  Created by osarapulov on 9/4/21 7:43 PM
 */

package dgca.verifier.app.android

import android.content.Context
import android.text.Spannable
import android.text.style.TextAppearanceSpan
import androidx.annotation.StyleRes

fun Spannable.applyStyle(context: Context, @StyleRes styleRes: Int): Spannable =
    apply {
        setSpan(
            TextAppearanceSpan(
                context,
                styleRes
            ),
            0,
            length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
