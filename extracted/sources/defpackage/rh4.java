package defpackage;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.c1;

/* JADX INFO: loaded from: classes.dex */
public final class rh4 extends c1 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh4(MapMakerInternalMap mapMakerInternalMap, int i) {
        super(mapMakerInternalMap);
        this.i = i;
    }

    @Override // com.google.common.collect.c1, java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return c().a;
            case 2:
                return c().b;
            default:
                return super.next();
        }
    }
}
