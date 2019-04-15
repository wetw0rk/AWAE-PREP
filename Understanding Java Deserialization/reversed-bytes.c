// obtained from: https://docs.oracle.com/javase/7/docs/api/constant-values.html
\xac\xed                          // -> Magic number identifying this is serialized data
\x00\x05                          // -> Protocol Version
\x73                              // -> we have a new object (TC_OBJECT)
\x72                              // -> Class description (TC_CLASSDESC)
\x00\x07                          // -> Length of class name
\x4c\x6f\x67\x46\x69\x6c\x65      // -> Class name: LogFile
\xd7\x60\x3d\xd7\x33\x3e\xbc\xd1  // -> Serial version UID: This is an identifier of the
                                  //    class. This value can be specified in the class,
                                  //    if not, it is generated automatically
\x02                              // -> Flag: class is serializable (SC_SERIALIZABLE)
\x00\x02                          // -> Number of variables in class
\x4c                              // -> Type code/signature - class
\x00\x0b                          // -> Length of the class variable: 11
\x66\x69\x6c\x65\x63\x6f          // -> Variable name: filecontent
\x6e\x74\x65\x6e\x74
\x74                              // -> A string (TC_STRING)
\x00\x12                          // -> Length of class name
\x4c\x6a\x61\x76\x61\x2f          // -> Class name: Ljava/lang/String;
\x6c\x61\x6e\x67\x2f\x53 
\x74\x72\x69\x6e\x67\x3b
\x4c                              // -> Type code/signature - class
\x00\x08                          // -> Length of the class variable: 8
\x66\x69\x6c\x65\x6e\x61\x6d\x65  // -> Variable name: filename
\x71                              // -> Refrence to previous object (TC_REFERENCE)
\x00\x7e\x00\x01                  // -> Object reference ID. Refrenced objects start
                                  //    from 0x7E0000
\x78                              // -> End of block data for this object (TC_ENDBLOCKDATA)
\x70                              // -> NULL reference, we finished the "class description"
                                  //    the data fill follow
\x74                              // -> A string (TC_STRING)
\x00\x11                          // -> Length of string: 17
\x4e\x6f\x20\x61\x63\x74\x69      // -> The string: "No actions logged"
\x6f\x6e\x73\x20\x6c\x6f\x67
\x67\x65\x64
\x74                              // -> A string (TC_STRING)
\x00\x0b                          // -> Length of string: 17
\x77\x65\x74\x77\x30\x72          // -> The string: "wetw0rk.log"
\x6b\x2e\x6c\x6f\x67
