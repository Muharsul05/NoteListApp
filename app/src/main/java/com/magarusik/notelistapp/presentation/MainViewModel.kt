package com.magarusik.notelistapp.presentation

import androidx.lifecycle.ViewModel
import com.magarusik.notelistapp.data.ShopListRepositoryImpl
import com.magarusik.notelistapp.domain.DeleteShopItemUseCase
import com.magarusik.notelistapp.domain.EditShopItemUseCase
import com.magarusik.notelistapp.domain.GetShopListUseCase
import com.magarusik.notelistapp.domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopItemList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}