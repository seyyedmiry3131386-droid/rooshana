package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class yg4 extends ah4 implements Iterator, dx3 {
    public final /* synthetic */ int e;

    public yg4(MapBuilder mapBuilder, int i) {
        this.e = i;
        js3.p(mapBuilder, "map");
        this.d = mapBuilder;
        this.b = -1;
        this.c = mapBuilder.h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                MapBuilder mapBuilder = (MapBuilder) this.d;
                if (i >= mapBuilder.f) {
                    throw new NoSuchElementException();
                }
                this.a = i + 1;
                this.b = i;
                zg4 zg4Var = new zg4(mapBuilder, i);
                e();
                return zg4Var;
            case 1:
                b();
                int i2 = this.a;
                MapBuilder mapBuilder2 = (MapBuilder) this.d;
                if (i2 >= mapBuilder2.f) {
                    throw new NoSuchElementException();
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = mapBuilder2.a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.a;
                MapBuilder mapBuilder3 = (MapBuilder) this.d;
                if (i3 >= mapBuilder3.f) {
                    throw new NoSuchElementException();
                }
                this.a = i3 + 1;
                this.b = i3;
                Object[] objArr = mapBuilder3.b;
                js3.m(objArr);
                Object obj2 = objArr[this.b];
                e();
                return obj2;
        }
    }
}
