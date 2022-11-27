package com.magarusik.notelistapp.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(showItemID: Int): ShopItem {
        return shopListRepository.getShopItem(showItemID)
    }
}