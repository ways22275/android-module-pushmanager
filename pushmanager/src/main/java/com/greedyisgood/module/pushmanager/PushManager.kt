package com.greedyisgood.module.pushmanager

import android.content.Context


/**
 * <p>PushManager - interface for easy access to FCM</p>
 *
 * @version  1.3.0
 * @since    1.0.0
 * @author   grumpyshoe
 *
 */
interface PushManager {


    /**
     * register device for cloudmessaging
     *
     */
    suspend fun register(context: Context, onTokenReceived: (String) -> Unit, onFailure: (Exception?) -> Unit)


    /**
     * delete this Firebase app installation from the Firebase backend
     *
     */
    suspend fun unregister(context: Context)


    /**
     * subscribe to topic
     *
     */
    fun subscribeToTopic(topic: String, onSuccess: (() -> Unit)? = null, onFailure: ((Exception?) -> Unit)? = null)


    /**
     * unsubscribe from topic
     *
     */
    fun unsubscribeFromTopic(topic: String, onSuccess: (() -> Unit)? = null, onFailure: ((Exception?) -> Unit)? = null)

}