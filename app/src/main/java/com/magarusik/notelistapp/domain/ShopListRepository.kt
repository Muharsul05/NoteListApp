package com.magarusik.notelistapp.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItemList(): LiveData<List<ShopItem>>
    fun deleteShopItem(shopItem: ShopItem)
    fun getShopItem(showItemID: Int): ShopItem
}