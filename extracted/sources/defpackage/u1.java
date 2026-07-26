package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ u1(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.a) {
            case 0:
                zContains = this.b.contains(obj);
                break;
            case 1:
                zContains = this.b.contains(obj);
                break;
            case 2:
                zContains = this.b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
