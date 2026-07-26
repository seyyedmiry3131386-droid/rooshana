package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public final Iterator a;

    public n(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage) {
        Iterator itK = generatedMessageLite$ExtendableMessage.extensions.k();
        this.a = itK;
        if (itK.hasNext()) {
        }
    }
}
