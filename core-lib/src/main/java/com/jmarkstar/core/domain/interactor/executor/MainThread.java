package com.jmarkstar.core.domain.interactor.executor;

/**
 * UI Thread abstraction created to change the execution Context from any Thread to the UI Thread.
 * <p>
 */
public interface MainThread {
  void post(final Runnable runnable);
}