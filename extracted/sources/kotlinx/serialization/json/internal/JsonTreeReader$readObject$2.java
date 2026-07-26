package kotlinx.serialization.json.internal;

import defpackage.pc1;
import defpackage.tb1;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    public pc1 a;
    public b b;
    public LinkedHashMap c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(b bVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return b.a(this.g, null, this);
    }
}
