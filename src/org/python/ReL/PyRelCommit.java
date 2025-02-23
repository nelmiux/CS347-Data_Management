package org.python.ReL;

import java.sql.SQLException;

import org.python.expose.ExposedType;

import org.python.core.PyObject;
import org.python.core.PyType;
import org.python.core.PyObjectDerived;
import org.python.core.PyStringMap;
import org.python.core.PyString;
import org.python.core.PyBoolean;
import org.python.core.PyInteger;
import org.python.core.BuiltinDocs;
import org.python.ReL.SIMHelper;
import org.python.ReL.PyRelConnection;

/**
 * A class that is responsible for executing an insert of a python class instance into the database.
 * The classes type must already be defined in the database. A run time exception will be thrown if the
 * class is not already defined.
 *
 * Attributes that the instance object has which is not already in the database will be added at the time of
 * insert.
 */
 @ExposedType(name = "PyRelCommit", base = PyObject.class, doc = BuiltinDocs.tuple_doc)
public class PyRelCommit extends PyObject {

    // The object instance is inserted at construction. 
    public PyRelCommit(PyObject conn) throws SQLException{
        super();
        ((PyRelConnection)conn).commit_oorel_session();
        
    }


}