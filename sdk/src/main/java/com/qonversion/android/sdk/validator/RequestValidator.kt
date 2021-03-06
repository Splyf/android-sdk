package com.qonversion.android.sdk.validator

import com.qonversion.android.sdk.dto.QonversionRequest

class RequestValidator : Validator<QonversionRequest> {
    override fun valid(value: QonversionRequest): Boolean {
        return value.isAuthorized()
    }
}