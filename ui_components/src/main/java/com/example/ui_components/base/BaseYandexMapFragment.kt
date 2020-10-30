package com.example.ui_components.base

import android.os.Bundle
import com.example.data.common.Constants
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.mapview.MapView

open class BaseYandexMapFragment : BaseFragment() {

    protected var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey(Constants.MAP_API)
        MapKitFactory.initialize(requireContext())
    }

    override fun onStop() {
        super.onStop()
        mapView?.onStop()
        MapKitFactory.getInstance().onStop()
    }

    override fun onStart() {
        super.onStart()
        mapView?.onStart()
        MapKitFactory.getInstance().onStart()
    }
}