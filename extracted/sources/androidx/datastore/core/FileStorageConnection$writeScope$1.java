package androidx.datastore.core;

import defpackage.ac2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {238, 112}, m = "writeScope", v = 1)
final class FileStorageConnection$writeScope$1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public ac2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
