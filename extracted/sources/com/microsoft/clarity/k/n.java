package com.microsoft.clarity.k;

import android.view.KeyEvent;
import com.microsoft.clarity.models.ingest.analytics.BackGestureEvent;
import defpackage.bp2;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Lambda implements bp2 {
    public final /* synthetic */ KeyEvent a;
    public final /* synthetic */ s b;
    public final /* synthetic */ q c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(KeyEvent keyEvent, s sVar, q qVar) {
        super(0);
        this.a = keyEvent;
        this.b = sVar;
        this.c = qVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        KeyEvent keyEvent = this.a;
        if (keyEvent != null && 4 == keyEvent.getKeyCode() && this.a.getAction() == 0) {
            this.b.a(new BackGestureEvent(System.currentTimeMillis(), this.c.a));
        }
        return tx8.a;
    }
}
