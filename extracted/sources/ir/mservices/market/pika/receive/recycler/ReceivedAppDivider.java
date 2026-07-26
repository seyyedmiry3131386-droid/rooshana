package ir.mservices.market.pika.receive.recycler;

import defpackage.js3;
import ir.mservices.market.common.ui.recycler.DividerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceivedAppDivider extends DividerData {
    public final String m;

    public ReceivedAppDivider(String str) {
        js3.p(str, "packageName");
        this.m = str;
    }
}
