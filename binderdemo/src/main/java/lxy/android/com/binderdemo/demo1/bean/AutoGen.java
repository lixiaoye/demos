//package lxy.android.com.binderdemo;
//
///**
// * Created by LIXIAOYE on 2019/1/25.
// */
//
///*
// * This file is auto-generated.  DO NOT MODIFY.
// * Original file: D:\\work\\Demos\\binderdemo\\src\\main\\aidl\\lxy\\android\\com\\binderdemo\\IBookManager.aidl
// */
//package lxy.android.com.binderdemo;
//
//public interface IBookManager extends android.os.IInterface {
//    /**
//     * Local-side IPC implementation stub class.本地端IPC实现存根类
//     */
//    public static abstract class Stub extends android.os.Binder implements lxy.android.com.binderdemo.IBookManager {
//        //DESCRIPTOR是Binder的唯一标识，一般用当前Binder的类名表示，
//        private static final java.lang.String DESCRIPTOR = "lxy.android.com.binderdemo.IBookManager";
//
//        /**
//         * Construct the stub at attach it to the interface.构造存根以将其附加到接口
//         */
//        public Stub() {
//            this.attachInterface(this, DESCRIPTOR);
//        }
//
//        /**
//         * Cast an IBinder object into an lxy.android.com.binderdemo.IBookManager interface,
//         * generating a proxy if needed. 将IBinder对象转换成lxy.android.com.binderdemo.IBookManager接口，
//         * 并在需要时生成代理
//         * asInterface方法作用：用于将服务端的Binder对象转换成客户端所需的AIDL接口类型的对象；
//         * 这种转换过程是区分进程的，如果客户端和服务端位于同一进程，那么此方法返回的是服务端的Stub对象本身，
//         * 否则返回的是系统封装后的Stub.proxy对象。
//         */
//        public static lxy.android.com.binderdemo.IBookManager asInterface(android.os.IBinder obj) {
//            if ((obj == null)) {
//                return null;
//            }
//            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
//            if (((iin != null) && (iin instanceof lxy.android.com.binderdemo.IBookManager))) {
//                return ((lxy.android.com.binderdemo.IBookManager) iin);//同一进程
//            }
//            return new lxy.android.com.binderdemo.IBookManager.Stub.Proxy(obj);//不同进程
//        }
//
//        @Override
//        public android.os.IBinder asBinder()//返回当前Binder对象
//        {
//            return this;
//        }
//
//        /**
//         * 运行在服务端中的Binder线程池中，当客户端发起跨进程请求时，远程请求会通过系统底层封装后
//         * 交由此方法来处理。
//         *
//         * @param code  客户端所请求的目标方法是什么
//         * @param data  目标方法所需的参数
//         * @param reply F
//         * @param flags
//         * @return
//         * @throws android.os.RemoteException
//         */
//        @Override
//        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
//            switch (code) {
//                case INTERFACE_TRANSACTION: {
//                    reply.writeString(DESCRIPTOR);
//                    return true;
//                }
//                case TRANSACTION_getBookList: {
//                    data.enforceInterface(DESCRIPTOR);
//                    java.util.List<lxy.android.com.binderdemo.Book> _result = this.getBookList();
//                    reply.writeNoException();
//                    reply.writeTypedList(_result);
//                    return true;
//                }
//                case TRANSACTION_addBook: {
//                    data.enforceInterface(DESCRIPTOR);
//                    lxy.android.com.binderdemo.Book _arg0;
//                    if ((0 != data.readInt())) {
//                        _arg0 = lxy.android.com.binderdemo.Book.CREATOR.createFromParcel(data);
//                    } else {
//                        _arg0 = null;
//                    }
//                    this.addBook(_arg0);
//                    reply.writeNoException();
//                    return true;
//                }
//            }
//            return super.onTransact(code, data, reply, flags);
//        }
//
//        private static class Proxy implements lxy.android.com.binderdemo.IBookManager {
//            private android.os.IBinder mRemote;
//
//            Proxy(android.os.IBinder remote) {
//                mRemote = remote;
//            }
//
//            @Override
//            public android.os.IBinder asBinder() {
//                return mRemote;
//            }
//
//            public java.lang.String getInterfaceDescriptor() {
//                return DESCRIPTOR;
//            }
//
//            @Override
//            public java.util.List<lxy.android.com.binderdemo.Book> getBookList() throws android.os.RemoteException {
//                android.os.Parcel _data = android.os.Parcel.obtain();
//                android.os.Parcel _reply = android.os.Parcel.obtain();
//                java.util.List<lxy.android.com.binderdemo.Book> _result;
//                try {
//                    _data.writeInterfaceToken(DESCRIPTOR);
//                    mRemote.transact(Stub.TRANSACTION_getBookList, _data, _reply, 0);
//                    _reply.readException();
//                    _result = _reply.createTypedArrayList(lxy.android.com.binderdemo.Book.CREATOR);
//                } finally {
//                    _reply.recycle();
//                    _data.recycle();
//                }
//                return _result;
//            }
//
//            @Override
//            public void addBook(lxy.android.com.binderdemo.Book book) throws android.os.RemoteException {
//                android.os.Parcel _data = android.os.Parcel.obtain();
//                android.os.Parcel _reply = android.os.Parcel.obtain();
//                try {
//                    _data.writeInterfaceToken(DESCRIPTOR);
//                    if ((book != null)) {
//                        _data.writeInt(1);
//                        book.writeToParcel(_data, 0);
//                    } else {
//                        _data.writeInt(0);
//                    }
//                    mRemote.transact(Stub.TRANSACTION_addBook, _data, _reply, 0);
//                    _reply.readException();
//                } finally {
//                    _reply.recycle();
//                    _data.recycle();
//                }
//            }
//        }
//
//        static final int TRANSACTION_getBookList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
//        static final int TRANSACTION_addBook = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
//    }
//
//    public java.util.List<lxy.android.com.binderdemo.Book> getBookList() throws android.os.RemoteException;
//
//    public void addBook(lxy.android.com.binderdemo.Book book) throws android.os.RemoteException;
//}
//
