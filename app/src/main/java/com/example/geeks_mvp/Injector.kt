package com.example.geeks_mvp

import android.service.autofill.Presentations

class Injector {


    companion object {
        fun getModel(): CounterModel {
            return CounterModel()
        }

        fun getPresenter(view: CounterView): CountPresenter {
            return CountPresenter(view)
        }
    }

}