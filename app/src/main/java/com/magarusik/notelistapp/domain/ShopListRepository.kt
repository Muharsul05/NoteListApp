package com.magarusik.notelistapp.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItemList(): List<ShopItem>
    fun deleteShopItem(shopItem: ShopItem)
    fun getShopItem(showItemID: Int): ShopItem
}