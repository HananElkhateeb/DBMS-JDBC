package eg.edu.alexu.csd.oop.db.cs20.Connection;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class DBConnection implements Connection{

	@Override
	public boolean isWrapperFor(Class<?> iface) throws java.lang.UnsupportedOperationException{
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public void abort(Executor executor) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void clearWarnings() throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void close() throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void commit() throws java.lang.UnsupportedOperationException {
	}

	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Blob createBlob() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Clob createClob() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public NClob createNClob() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public SQLXML createSQLXML() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
			throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public boolean getAutoCommit() throws java.lang.UnsupportedOperationException {
		return false;
	}

	@Override
	public String getCatalog() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Properties getClientInfo() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public String getClientInfo(String name) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public int getHoldability() throws java.lang.UnsupportedOperationException {
		return 0;
	}

	@Override
	public DatabaseMetaData getMetaData() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public int getNetworkTimeout() throws java.lang.UnsupportedOperationException {
		return 0;
	}

	@Override
	public String getSchema() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public int getTransactionIsolation() throws java.lang.UnsupportedOperationException {
		return 0;
	}

	@Override
	public Map<String, Class<?>> getTypeMap() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public SQLWarning getWarnings() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public boolean isClosed() throws java.lang.UnsupportedOperationException {
		return false;
	}

	@Override
	public boolean isReadOnly() throws java.lang.UnsupportedOperationException {
		return false;
	}

	@Override
	public boolean isValid(int timeout) throws java.lang.UnsupportedOperationException {
		return false;
	}

	@Override
	public String nativeSQL(String sql) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
			throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
			int resultSetHoldability)throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public void releaseSavepoint(Savepoint savepoint) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void rollback()throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void rollback(Savepoint savepoint) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setAutoCommit(boolean autoCommit) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setCatalog(String catalog) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setClientInfo(Properties properties) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setClientInfo(String name, String value) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setHoldability(int holdability) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setReadOnly(boolean readOnly) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public Savepoint setSavepoint() throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public Savepoint setSavepoint(String name) throws java.lang.UnsupportedOperationException {
		return null;
	}

	@Override
	public void setSchema(String schema) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setTransactionIsolation(int level) throws java.lang.UnsupportedOperationException {
	}

	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws java.lang.UnsupportedOperationException {
	}



}
