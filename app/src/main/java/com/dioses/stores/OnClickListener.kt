package com.dioses.stores

interface OnClickListener {
    fun onClick(storeEntity: StoreEntity)
    fun onFavoriteStore(storeEntity: StoreEntity)
}