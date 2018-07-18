
package com.microbitcoin.mbcj.core.listeners;

import com.microbitcoin.mbcj.core.EmptyMessage;
import com.microbitcoin.mbcj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class SendHeadersMessage extends EmptyMessage {
    public SendHeadersMessage(NetworkParameters params) {
        super(params);
    }
}
