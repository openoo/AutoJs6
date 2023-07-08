package org.autojs.autojs.core.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import org.autojs.autojs.core.ui.JsViewHelper

/**
 * Created by Stardust on 2017/5/14.
 * Transformed by SuperMonster003 on May 22, 2023.
 */
class JsLinearLayout : LinearLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    fun id(id: String?) = JsViewHelper.findViewByStringId(this, id)

}