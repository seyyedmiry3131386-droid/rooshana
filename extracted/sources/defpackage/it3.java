package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class it3 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ it3(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.get(((Number) obj).intValue());
                break;
            case 1:
                this.b.get(((Number) obj).intValue());
                break;
            case 2:
                this.b.get(((Number) obj).intValue());
                break;
            default:
                this.b.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
