package com.sogou.map.kubbo.remote.transport.netty4;

import com.sogou.map.kubbo.common.logger.Logger;
import com.sogou.map.kubbo.common.logger.LoggerFactory;

import io.netty.util.internal.logging.AbstractInternalLogger;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

/**
 * @author liufuliang
 */
final class NettyLoggerAdapter {

    public static void setNettyLoggerFactory() {
        InternalLoggerFactory factory = InternalLoggerFactory.getDefaultFactory();
        if (factory == null || !(factory instanceof KubboLoggerFactory)) {
            InternalLoggerFactory.setDefaultFactory(new KubboLoggerFactory());
        }
    }

    static class KubboLoggerFactory extends InternalLoggerFactory {

        @Override
        public InternalLogger newInstance(String name) {
            return new KubboLogger(LoggerFactory.getLogger(name));
        }
    }

    static class KubboLogger extends AbstractInternalLogger {
        /**
         * 
         */
        private static final long serialVersionUID = -9073867371277304347L;
        private Logger logger;

        KubboLogger(Logger logger) {
            super(logger.toString());
            this.logger = logger;
        }

        @Override
        public boolean isTraceEnabled() {
            return logger.isTraceEnabled();
        }

        @Override
        public void trace(String msg) {
            logger.trace(msg);
        }

        @Override
        public void trace(String msg, Object o) {
            //TODO
        }

        @Override
        public void trace(String msg, Object o, Object o2) {
            //TODO
        }

        @Override
        public void trace(String msg, Object... objects) {
            //TODO
        }

        @Override
        public void trace(String msg, Throwable throwable) {
            logger.trace(msg, throwable);
        }

        public boolean isDebugEnabled() {
            return logger.isDebugEnabled();
        }

        public boolean isInfoEnabled() {
            return logger.isInfoEnabled();
        }

        public boolean isWarnEnabled() {
            return logger.isWarnEnabled();
        }

        public boolean isErrorEnabled() {
            return logger.isErrorEnabled();
        }

        public void debug(String msg) {
            logger.debug(msg);
        }

        @Override
        public void debug(String msg, Object o) {
            //TODO
        }

        @Override
        public void debug(String msg, Object o, Object o2) {
            //TODO
        }

        @Override
        public void debug(String msg, Object... objects) {
            //TODO
        }

        public void debug(String msg, Throwable cause) {
            logger.debug(msg, cause);
        }

        public void info(String msg) {
            logger.info(msg);
        }

        @Override
        public void info(String msg, Object o) {
            //TODO
        }

        @Override
        public void info(String msg, Object o, Object o2) {
            //TODO
        }

        @Override
        public void info(String msg, Object... objects) {
            //TODO
        }

        public void info(String msg, Throwable cause) {
            logger.info(msg, cause);
        }

        public void warn(String msg) {
            logger.warn(msg);
        }

        @Override
        public void warn(String s, Object o) {
            //TODO
        }

        @Override
        public void warn(String s, Object... objects) {
            //TODO
        }

        @Override
        public void warn(String s, Object o, Object o2) {
            //TODO
        }

        public void warn(String msg, Throwable cause) {
            logger.warn(msg, cause);
        }

        public void error(String msg) {
            logger.error(msg);
        }

        @Override
        public void error(String msg, Object o) {
            //TODO
        }

        @Override
        public void error(String msg, Object o, Object o2) {
            //TODO
        }

        @Override
        public void error(String msg, Object... objects) {
            // TODO
        }

        public void error(String msg, Throwable cause) {
            logger.error(msg, cause);
        }

        @Override
        public String toString() {
            return logger.toString();
        }
    }

}
