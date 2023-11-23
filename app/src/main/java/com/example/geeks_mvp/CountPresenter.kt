package com.example.geeks_mvp

class CountPresenter(private val counterView: CounterView) {

    private var model = Injector.getModel()

    fun increment() {
        model.increment()
        counterView.showChangeCount(model.count)

        if (model.count == 10) {
            counterView.showToast()
        }

        if(model.count == 15) {
            counterView.showColor()
        }
    }

    fun decrement() {
        model.decrement()
        counterView.showChangeCount(model.count)
    }
}