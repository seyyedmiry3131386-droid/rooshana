package androidx.compose.ui.text.font;

import defpackage.p67;
import defpackage.tb1;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load", v = 1)
final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    public List a;
    public p67 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ b f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
