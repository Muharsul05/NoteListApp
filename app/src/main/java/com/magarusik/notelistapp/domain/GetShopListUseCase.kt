package com.magarusik.notelistapp.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItemList(): List<ShopItem> {
        return shopListRepository.getShopItemList()
    }
}