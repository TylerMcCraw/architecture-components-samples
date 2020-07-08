package com.example.android.navigationadvancedsample

import android.net.Uri

/**
 * Activity which will handle navigating to a [Uri]
 */
interface NavigatorActivity {

    fun navigateToUri(uri: Uri)
}
