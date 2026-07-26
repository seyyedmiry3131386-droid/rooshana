package androidx.datastore.core;

import defpackage.rb2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {96}, m = "readScope", v = 1)
final class FileStorageConnection$readScope$1<R> extends ContinuationImpl {
    public boolean a;
    public rb2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$readScope$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
