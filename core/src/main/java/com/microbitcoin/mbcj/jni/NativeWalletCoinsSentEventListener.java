/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microbitcoin.mbcj.jni;

import com.microbitcoin.mbcj.wallet.Wallet;
import com.microbitcoin.mbcj.wallet.listeners.WalletCoinsSentEventListener;
import com.microbitcoin.mbcj.core.Coin;
import com.microbitcoin.mbcj.core.Transaction;

/**
 * An event listener that relays events to a native C++ object. A pointer to that object is stored in
 * this class using JNI on the native side, thus several instances of this can point to different actual
 * native implementations.
 */
@SuppressWarnings("all")
public class NativeWalletCoinsSentEventListener implements WalletCoinsSentEventListener {
    public long ptr;

    @Override
    public native void onCoinsSent(Wallet wallet, Transaction tx, Coin prevBalance, Coin newBalance);
}