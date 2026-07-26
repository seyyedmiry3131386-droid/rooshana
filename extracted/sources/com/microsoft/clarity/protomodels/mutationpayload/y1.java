package com.microsoft.clarity.protomodels.mutationpayload;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends com.google.protobuf.m implements z1 {
    public y1() {
        super(MutationPayload$ViewNodeDelta.DEFAULT_INSTANCE);
    }

    public final void a(double d) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setRenderNodeId(d);
    }

    public final void b(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setHeight(i);
    }

    public final void c(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setId(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setViewHeight(i);
    }

    public final void e(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setViewWidth(i);
    }

    public final void f(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setViewX(i);
    }

    public final void g(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setViewY(i);
    }

    public final void h(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setWidth(i);
    }

    public final void i(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setX(i);
    }

    public final void j(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setY(i);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setClickable(z);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setIgnoreClicks(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setType(str);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setIsWebView(z);
    }

    public final void e(boolean z) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setVisible(z);
    }

    public final void a(int i) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setBackgroundColor(i);
    }

    public final void b(String str) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setText(str);
    }

    public final void c(boolean z) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setIsMasked(z);
    }

    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).addAllChildren(arrayList);
    }

    public final void a(String str) {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setIdEntryName(str);
    }

    public final void a() {
        copyOnWrite();
        ((MutationPayload$ViewNodeDelta) this.instance).setIsBackgroundColorSet(true);
    }
}
