package com.magarusik.notelistapp.data

import com.magarusik.notelistapp.domain.ShopItem
import com.magarusik.notelistapp.domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        deleteShopItem(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItemList(): List<ShopItem> = shopList.toList()


    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun getShopItem(showItemID: Int): ShopItem {
        return shopList.find {
            it.id == showItemID
        } ?: throw RuntimeException("Element with id $showItemID not found")
    }
}