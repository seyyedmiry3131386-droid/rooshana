package io.sentry;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d6 extends defpackage.y {
    public static final List u = DesugarCollections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;
    public Double d;
    public Double e;
    public SentryReplayOptions$SentryReplayQuality f;
    public int g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public io.sentry.protocol.t l;
    public boolean m;
    public ScreenshotStrategyType n;
    public boolean o;
    public List p;
    public List q;
    public boolean r;
    public List s;
    public List t;

    @Override // defpackage.y
    public final void A(boolean z) {
        if (!z) {
            E();
        }
        super.A(z);
    }

    @Override // defpackage.y
    public final void B(boolean z) {
        if (!z) {
            E();
        }
        super.B(z);
    }

    @Override // defpackage.y
    public final void E() {
        if (this.c) {
            return;
        }
        this.c = true;
        io.sentry.config.a.a("ReplayCustomMasking");
    }

    public final List G() {
        return this.p;
    }

    public final List H() {
        return this.q;
    }

    public final List I() {
        return this.s;
    }

    public final List J() {
        return this.t;
    }

    public final Double K() {
        return this.e;
    }

    public final Double L() {
        return this.d;
    }

    public final boolean M() {
        return this.o;
    }

    public final boolean N() {
        return this.r;
    }

    public final void O(boolean z) {
        this.o = z;
    }

    public final void P(boolean z) {
        this.m = z;
    }

    public final void Q(boolean z) {
        this.r = z;
    }

    public final void R(ArrayList arrayList) {
        this.p = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void S(ArrayList arrayList) {
        this.q = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void T(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.s = DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void U(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.t = DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void V(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.e = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void W(Double d) {
        if (io.sentry.config.a.O(d, true)) {
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
