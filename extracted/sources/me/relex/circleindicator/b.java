package me.relex.circleindicator;

import defpackage.o89;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o89 {
    public final /* synthetic */ CircleIndicator3 a;

    public b(CircleIndicator3 circleIndicator3) {
        this.a = circleIndicator3;
    }

    @Override // defpackage.o89
    public final void c(int i) {
        CircleIndicator3 circleIndicator3 = this.a;
        if (i == circleIndicator3.j || circleIndicator3.k.getAdapter() == null || circleIndicator3.k.getAdapter().c() <= 0) {
            return;
        }
        circleIndicator3.a(i);
    }
}
