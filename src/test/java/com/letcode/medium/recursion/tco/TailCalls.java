package com.letcode.medium.recursion.tco;

public class TailCalls<T> {
  public TailCall<T> call(final TailCall<T> nextCall) {
    return nextCall;
  }

  public TailCall<T> done(final T value) {
    return new TailCall<>() {
      @Override
      public boolean isComplete() {
        return true;
      }

      @Override
      public T result() {
        return value;
      }

      @Override
      public TailCall<T> apply() {
        throw new Error("not implemented");
      }
    };
  }
}