package com.google.protobuf;

import defpackage.ev4;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class GeneratedMessageLite$SerializedForm implements Serializable {
    private static final long serialVersionUID = 0;

    public Object readResolve() throws ObjectStreamException {
        try {
            try {
                java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((ev4) declaredField.get(null)).newBuilderForType().mergeFrom((byte[]) null).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: null", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in null", e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call defaultInstance in null", e5);
            }
        } catch (InvalidProtocolBufferException e6) {
            throw new RuntimeException("Unable to understand proto buffer", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("Unable to find proto buffer class: null", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Unable to call parsePartialFrom", e8);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
            declaredField2.setAccessible(true);
            return ((ev4) declaredField2.get(null)).newBuilderForType().mergeFrom((byte[]) null).buildPartial();
        } catch (SecurityException e9) {
            throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e9);
        }
    }
}
