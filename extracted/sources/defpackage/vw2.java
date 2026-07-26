package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vw2 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ vw2(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return new al6(this.b, 0);
            default:
                return new al6(this.b, 1);
        }
    }
}
