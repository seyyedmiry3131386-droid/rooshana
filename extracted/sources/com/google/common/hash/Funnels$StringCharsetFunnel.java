package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class Funnels$StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
    public final Charset a;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final String a;

        public SerializedForm(Charset charset) {
            this.a = charset.name();
        }

        private Object readResolve() {
            return new Funnels$StringCharsetFunnel(Charset.forName(this.a));
        }
    }

    public Funnels$StringCharsetFunnel(Charset charset) {
        charset.getClass();
        this.a = charset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Funnels$StringCharsetFunnel) {
            return this.a.equals(((Funnels$StringCharsetFunnel) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Funnels$StringCharsetFunnel.class.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        return "Funnels.stringFunnel(" + this.a.name() + ")";
    }

    public Object writeReplace() {
        return new SerializedForm(this.a);
    }
}
